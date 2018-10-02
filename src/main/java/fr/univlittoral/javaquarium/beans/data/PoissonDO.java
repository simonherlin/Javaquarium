package fr.univlittoral.javaquarium.beans.data;

import javax.persistence.*;

/**
 * Entity object Poisson
 * @author simon
 *
 */

@Entity
@Table(name = "Poisson")
public class PoissonDO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "poisson_id")
    private Long id;

    @Column(name = "poisson_specie", unique = true)
    private String specie;

    @Column(name = "poisson_description")
    private String description;

    @Column(name = "poisson_color")
    private String color;

    @Column(name = "poisson_length")
    private Double length;

    @Column(name = "poisson_width")
    private Double width;

    @Column(name = "poisson_price")
    private String price;

    
    /**
     * Get id value
     *
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id : id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Get specie value
     *
     * @return specie
     */
    public String getSpecie() {
        return specie;
    }

    /**
     * @param specie : specie to set
     */
    public void setSpecie(String specie) {
        this.specie = specie;
    }

    /**
     * Get description value
     *
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description : description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Get color value
     *
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color : color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Get width value
     *
     * @return width
     */
    public Double getWidth() {
        return width;
    }

    /**
     * @param width : width to set
     */
    public void setWidth(Double width) {
        this.width = width;
    }

    /**
     * Get length value
     *
     * @return length
     */
    public Double getLength() {
        return length;
    }

    /**
     * @param length : length to set
     */
    public void setLength(Double length) {
        this.length = length;
    }

    /**
     * Get price value
     *
     * @return price
     */
    public String getPrice() {
        return price;
    }

    /**
     * @param price : price to set
     */
    public void setPrice(String price) {
        this.price = price;
    }

}
