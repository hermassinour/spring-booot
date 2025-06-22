    package com.springboot.model;

    import jakarta.persistence.*;
    import jakarta.validation.constraints.Email;
    import jakarta.validation.constraints.NotBlank;
    import com.fasterxml.jackson.annotation.JsonProperty;
    import com.fasterxml.jackson.annotation.JsonIgnore;
    import lombok.Getter;
    import lombok.NoArgsConstructor;
    import lombok.Setter;
    import org.springframework.security.core.GrantedAuthority;
    import org.springframework.security.core.authority.SimpleGrantedAuthority;
    import org.springframework.security.core.userdetails.UserDetails;
    import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

    import java.util.Collection;
    import java.util.Collections;
    import java.util.Set;
    import java.util.stream.Collectors;

    @Getter
    @Setter
    @NoArgsConstructor
    @Entity
    @Table(name = "users")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "orders"})
    public class User implements UserDetails {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        // --- New fields ---
        @Column(name = "first_name")
        private String firstName;

        @Column(name = "last_name")
        private String lastName;

        @Column(name = "phone")
        private String phone;

        @NotBlank(message = "❌ Name cannot be empty")
        private String name;

        @Email(message = "❌ Must be a valid email")
        @NotBlank(message = "❌ Email cannot be empty")
        private String email;

        @JsonProperty("password")
        @NotBlank(message = "❌ Password is required")
        private String password;

        @Column(name = "reset_token")
        private String resetToken;

        @Column(name = "token_expiry")
        private java.time.LocalDateTime tokenExpiry;

        // --- Roles ---
        @ElementCollection(fetch = FetchType.EAGER)
        @CollectionTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id"))
        @Enumerated(EnumType.STRING)
        @Column(name = "role")
        private Set<Role> roles = new java.util.HashSet<>();

        // Orders
        @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
        @JsonIgnore
        private java.util.List<Order> orders = new java.util.ArrayList<>();

        public User(String name, String email, String password) {
            this.name = name;
            this.email = email;
            this.password = password;
            this.roles = Collections.singleton(Role.USER);
        }

        // UserDetails methods...

        @Override
        public Collection<? extends GrantedAuthority> getAuthorities() {
            return roles.stream()
                    .map(role -> new SimpleGrantedAuthority("ROLE_" + role.name()))
                    .collect(Collectors.toSet());
        }

        @Override
        public String getUsername() {
            return email;
        }
        @Override
        public boolean isAccountNonExpired() { return true; }
        @Override
        public boolean isAccountNonLocked() { return true; }
        @Override
        public boolean isCredentialsNonExpired() { return true; }
        @Override
        public boolean isEnabled() { return true; }
    }
