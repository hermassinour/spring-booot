
package com.springboot.dto.orderviewrs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * NDC Capability Model: Descriptions
 * 
 * REPRESENTATIONS
 *  ============
 * • Source URL
 * • Plain Text
 * • Marked-Up Text
 * • Rich Media Object ID and/ or URL to Source (e.g. images and streaming video)
 *  ============
 *  ====
 * Feature(s)
 * 
 * a) Rendering Instructions, for converting an attachment into a specified display format, may be included with Media Attachments.
 *  3. Metadata: Yes
 * 
 *  2. Rendering Instructions, for converting an attachment into a specified display format, may be included with Media Attachments.
 * 
 *  3. These capabilities may not be supported by all NDC-enabled systems or may be supported by bilateral agreement only. If supported, the technical implementation of this capability is not dictated by this specification.
 * 
 * <p>Java class for DescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="Text" minOccurs="0"&gt;
 *             &lt;complexType&gt;
 *               &lt;simpleContent&gt;
 *                 &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS&gt;DescriptionSimpleType"&gt;
 *                   &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}ObjAssociationAttrGroup"/&gt;
 *                 &lt;/extension&gt;
 *               &lt;/simpleContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="MarkupStyle" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}ProperNameSimpleType" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="Link" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Media" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="ObjectID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}MediaID_Type"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}MediaLink"/&gt;
 *                   &lt;element name="AttachmentID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}MediaID_Type"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}ObjAssociationAttrGroup"/&gt;
 *       &lt;attribute name="ObjectKey" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescriptionType", propOrder = {
    "text",
    "markupStyle",
    "link",
    "media"
})
@XmlSeeAlso({
    com.springboot.dto.orderviewrs.MarketingMessages.MarketMessage.class,
    com.springboot.dto.orderviewrs.MarketingInfoType.Message.class,
    com.springboot.dto.orderviewrs.ServiceDescriptionType.Description.class,
    com.springboot.dto.orderviewrs.Description.class
})
public class DescriptionType {

    @XmlElement(name = "Text")
    protected DescriptionType.Text text;
    @XmlElement(name = "MarkupStyle")
    protected String markupStyle;
    @XmlElement(name = "Link")
    protected String link;
    @XmlElement(name = "Media")
    protected List<DescriptionType.Media> media;
    @XmlAttribute(name = "ObjectKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String objectKey;
    @XmlAttribute(name = "refs")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refs;

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link DescriptionType.Text }
     *     
     */
    public DescriptionType.Text getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescriptionType.Text }
     *     
     */
    public void setText(DescriptionType.Text value) {
        this.text = value;
    }

    /**
     * Gets the value of the markupStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkupStyle() {
        return markupStyle;
    }

    /**
     * Sets the value of the markupStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkupStyle(String value) {
        this.markupStyle = value;
    }

    /**
     * Gets the value of the link property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLink() {
        return link;
    }

    /**
     * Sets the value of the link property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLink(String value) {
        this.link = value;
    }

    /**
     * Gets the value of the media property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the media property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMedia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptionType.Media }
     * 
     * 
     */
    public List<DescriptionType.Media> getMedia() {
        if (media == null) {
            media = new ArrayList<DescriptionType.Media>();
        }
        return this.media;
    }

    /**
     * Gets the value of the objectKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectKey() {
        return objectKey;
    }

    /**
     * Sets the value of the objectKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectKey(String value) {
        this.objectKey = value;
    }

    /**
     * Gets the value of the refs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefs() {
        return refs;
    }

    /**
     * Sets the value of the refs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefs(String value) {
        this.refs = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;choice&gt;
     *         &lt;element name="ObjectID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}MediaID_Type"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}MediaLink"/&gt;
     *         &lt;element name="AttachmentID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}MediaID_Type"/&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "objectID",
        "mediaLink",
        "attachmentID"
    })
    public static class Media {

        @XmlElement(name = "ObjectID")
        protected MediaIDType objectID;
        @XmlElement(name = "MediaLink")
        protected MediaLink mediaLink;
        @XmlElement(name = "AttachmentID")
        protected MediaIDType attachmentID;

        /**
         * Gets the value of the objectID property.
         * 
         * @return
         *     possible object is
         *     {@link MediaIDType }
         *     
         */
        public MediaIDType getObjectID() {
            return objectID;
        }

        /**
         * Sets the value of the objectID property.
         * 
         * @param value
         *     allowed object is
         *     {@link MediaIDType }
         *     
         */
        public void setObjectID(MediaIDType value) {
            this.objectID = value;
        }

        /**
         * Description-associated MEDIA LINK.
         * 
         * @return
         *     possible object is
         *     {@link MediaLink }
         *     
         */
        public MediaLink getMediaLink() {
            return mediaLink;
        }

        /**
         * Sets the value of the mediaLink property.
         * 
         * @param value
         *     allowed object is
         *     {@link MediaLink }
         *     
         */
        public void setMediaLink(MediaLink value) {
            this.mediaLink = value;
        }

        /**
         * Gets the value of the attachmentID property.
         * 
         * @return
         *     possible object is
         *     {@link MediaIDType }
         *     
         */
        public MediaIDType getAttachmentID() {
            return attachmentID;
        }

        /**
         * Sets the value of the attachmentID property.
         * 
         * @param value
         *     allowed object is
         *     {@link MediaIDType }
         *     
         */
        public void setAttachmentID(MediaIDType value) {
            this.attachmentID = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS&gt;DescriptionSimpleType"&gt;
     *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}ObjAssociationAttrGroup"/&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Text {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "refs")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String refs;

        /**
         * A data type for Description encoding constraint: Minimum Length of 1
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the refs property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRefs() {
            return refs;
        }

        /**
         * Sets the value of the refs property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRefs(String value) {
            this.refs = value;
        }

    }

}
