package lv.tsi.javacourses.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Inventory {
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private Long item_Id;
    @Column
    private Long locaton_Id;
    @Column
    private int quantity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getItem_Id() {
        return item_Id;
    }

    public void setItem_Id(Long item_Id) {
        this.item_Id = item_Id;
    }

    public Long getLocaton_Id() {
        return locaton_Id;
    }

    public void setLocaton_Id(Long locaton_Id) {
        this.locaton_Id = locaton_Id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
