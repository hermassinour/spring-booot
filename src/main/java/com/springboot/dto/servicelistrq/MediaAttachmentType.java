
package com.springboot.dto.servicelistrq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * MEDIA ATTACHMENT representation.
 * 
 * <p>Java class for MediaAttachmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MediaAttachmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRQ}ImageID" minOccurs="0"/&gt;
 *         &lt;element name="AttachmentURI" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;anyURI"&gt;
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRQ}ObjAssociationAttrGroup"/&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Description" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRQ}DescriptionSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="Mimetype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FileKbSize" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRQ}ContextSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="Rendering" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRQ}RenderingInstructionsType" minOccurs="0"/&gt;
 *         &lt;element name="Content" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRQ}ObjAssociationAttrGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MediaAttachmentType", propOrder = {
    "imageID",
    "attachmentURI",
    "description",
    "mimetype",
    "fileKbSize",
    "rendering",
    "content"
})
public class MediaAttachmentType {

    @XmlElement(name = "ImageID")
    protected ImageID imageID;
    @XmlElement(name = "AttachmentURI")
    protected MediaAttachmentType.AttachmentURI attachmentURI;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Mimetype")
    protected String mimetype;
    @XmlElement(name = "FileKbSize")
    protected String fileKbSize;
    @XmlElement(name = "Rendering")
    protected RenderingInstructionsType rendering;
    @XmlElement(name = "Content")
    protected byte[] content;
    @XmlAttribute(name = "refs")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refs;

    /**
     * Gets the value of the imageID property.
     * 
     * @return
     *     possible object is
     *     {@link ImageID }
     *     
     */
    public ImageID getImageID() {
        return imageID;
    }

    /**
     * Sets the value of the imageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageID }
     *     
     */
    public void setImageID(ImageID value) {
        this.imageID = value;
    }

    /**
     * Gets the value of the attachmentURI property.
     * 
     * @return
     *     possible object is
     *     {@link MediaAttachmentType.AttachmentURI }
     *     
     */
    public MediaAttachmentType.AttachmentURI getAttachmentURI() {
        return attachmentURI;
    }

    /**
     * Sets the value of the attachmentURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaAttachmentType.AttachmentURI }
     *     
     */
    public void setAttachmentURI(MediaAttachmentType.AttachmentURI value) {
        this.attachmentURI = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the mimetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMimetype() {
        return mimetype;
    }

    /**
     * Sets the value of the mimetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMimetype(String value) {
        this.mimetype = value;
    }

    /**
     * Gets the value of the fileKbSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileKbSize() {
        return fileKbSize;
    }

    /**
     * Sets the value of the fileKbSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileKbSize(String value) {
        this.fileKbSize = value;
    }

    /**
     * Gets the value of the rendering property.
     * 
     * @return
     *     possible object is
     *     {@link RenderingInstructionsType }
     *     
     */
    public RenderingInstructionsType getRendering() {
        return rendering;
    }

    /**
     * Sets the value of the rendering property.
     * 
     * @param value
     *     allowed object is
     *     {@link RenderingInstructionsType }
     *     
     */
    public void setRendering(RenderingInstructionsType value) {
        this.rendering = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setContent(byte[] value) {
        this.content = value;
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
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;anyURI"&gt;
     *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRQ}ObjAssociationAttrGroup"/&gt;
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
    public static class AttachmentURI {

        @XmlValue
        @XmlSchemaType(name = "anyURI")
        protected String value;
        @XmlAttribute(name = "refs")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String refs;

        /**
         * Gets the value of the value property.
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
