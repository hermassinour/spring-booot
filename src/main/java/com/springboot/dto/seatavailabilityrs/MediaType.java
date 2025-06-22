
package com.springboot.dto.seatavailabilityrs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Electronic documents, images, and other files which accompany and support some information.
 * 
 * <p>Java class for MediaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MediaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MediaID" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}ID_Type"/&gt;
 *         &lt;element name="DescText" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}TextType" minOccurs="0"/&gt;
 *         &lt;element name="MimeTypeText" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}TextType" minOccurs="0"/&gt;
 *         &lt;element name="URL" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}UniformResourceID_Type" minOccurs="0"/&gt;
 *         &lt;element name="FileSizeMeasure" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="WidthMeasure" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="HeightMeasure" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="HintText" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}TextType" minOccurs="0"/&gt;
 *         &lt;element name="RenderingInstructionsText" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}TextType" minOccurs="0"/&gt;
 *         &lt;element name="RenderingMethodText" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}TextType" minOccurs="0"/&gt;
 *         &lt;element name="RenderingOutputFormatText" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}TextType" minOccurs="0"/&gt;
 *         &lt;element name="RenderingOverviewText" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}TextType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MediaType", propOrder = {
    "mediaID",
    "descText",
    "mimeTypeText",
    "url",
    "fileSizeMeasure",
    "widthMeasure",
    "heightMeasure",
    "hintText",
    "renderingInstructionsText",
    "renderingMethodText",
    "renderingOutputFormatText",
    "renderingOverviewText"
})
public class MediaType {

    @XmlElement(name = "MediaID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String mediaID;
    @XmlElement(name = "DescText")
    protected String descText;
    @XmlElement(name = "MimeTypeText")
    protected String mimeTypeText;
    @XmlElement(name = "URL")
    @XmlSchemaType(name = "anyURI")
    protected String url;
    @XmlElement(name = "FileSizeMeasure")
    protected MeasureType fileSizeMeasure;
    @XmlElement(name = "WidthMeasure")
    protected MeasureType widthMeasure;
    @XmlElement(name = "HeightMeasure")
    protected MeasureType heightMeasure;
    @XmlElement(name = "HintText")
    protected String hintText;
    @XmlElement(name = "RenderingInstructionsText")
    protected String renderingInstructionsText;
    @XmlElement(name = "RenderingMethodText")
    protected String renderingMethodText;
    @XmlElement(name = "RenderingOutputFormatText")
    protected String renderingOutputFormatText;
    @XmlElement(name = "RenderingOverviewText")
    protected String renderingOverviewText;

    /**
     * Gets the value of the mediaID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaID() {
        return mediaID;
    }

    /**
     * Sets the value of the mediaID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaID(String value) {
        this.mediaID = value;
    }

    /**
     * Gets the value of the descText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescText() {
        return descText;
    }

    /**
     * Sets the value of the descText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescText(String value) {
        this.descText = value;
    }

    /**
     * Gets the value of the mimeTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMimeTypeText() {
        return mimeTypeText;
    }

    /**
     * Sets the value of the mimeTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMimeTypeText(String value) {
        this.mimeTypeText = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the fileSizeMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getFileSizeMeasure() {
        return fileSizeMeasure;
    }

    /**
     * Sets the value of the fileSizeMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setFileSizeMeasure(MeasureType value) {
        this.fileSizeMeasure = value;
    }

    /**
     * Gets the value of the widthMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getWidthMeasure() {
        return widthMeasure;
    }

    /**
     * Sets the value of the widthMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setWidthMeasure(MeasureType value) {
        this.widthMeasure = value;
    }

    /**
     * Gets the value of the heightMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getHeightMeasure() {
        return heightMeasure;
    }

    /**
     * Sets the value of the heightMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setHeightMeasure(MeasureType value) {
        this.heightMeasure = value;
    }

    /**
     * Gets the value of the hintText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHintText() {
        return hintText;
    }

    /**
     * Sets the value of the hintText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHintText(String value) {
        this.hintText = value;
    }

    /**
     * Gets the value of the renderingInstructionsText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenderingInstructionsText() {
        return renderingInstructionsText;
    }

    /**
     * Sets the value of the renderingInstructionsText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRenderingInstructionsText(String value) {
        this.renderingInstructionsText = value;
    }

    /**
     * Gets the value of the renderingMethodText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenderingMethodText() {
        return renderingMethodText;
    }

    /**
     * Sets the value of the renderingMethodText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRenderingMethodText(String value) {
        this.renderingMethodText = value;
    }

    /**
     * Gets the value of the renderingOutputFormatText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenderingOutputFormatText() {
        return renderingOutputFormatText;
    }

    /**
     * Sets the value of the renderingOutputFormatText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRenderingOutputFormatText(String value) {
        this.renderingOutputFormatText = value;
    }

    /**
     * Gets the value of the renderingOverviewText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenderingOverviewText() {
        return renderingOverviewText;
    }

    /**
     * Sets the value of the renderingOverviewText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRenderingOverviewText(String value) {
        this.renderingOverviewText = value;
    }

}
