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

    @Column(name = "poisson_description1")
    private String description1;
    
    @Column(name = "poisson_description2")
    private String description2;
    
    @Column(name = "poisson_description3")
    private String description3;

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
     * Get description1 value
     *
     * @return description1
     */
    public String getDescription1() {
        return description1;
    }

    /**
     * @param description1 : description1 to set
     */
    public void setDescription1(String description1) {
        this.description1 = description1;
    }

    /**
     * Get description2 value
     *
     * @return description2
     */
    public String getDescription2() {
        return description1;
    }

    /**
     * @param description2 : description2 to set
     */
    public void setDescription2(String description2) {
        this.description2 = description2;
    }
    
    /**
     * Get description3 value
     *
     * @return description3
     */
    public String getDescription3() {
        return description3;
    }

    /**
     * @param description3 : description1 to set
     */
    public void setDescription3(String description3) {
        this.description3 = description3;
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
	 * @return the price
	 */
	public String getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(String price) {
		this.price = price;
	}

}
