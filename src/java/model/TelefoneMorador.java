/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Rafael
 */
@Entity
public class TelefoneMorador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "tel_1")
    private String tel_1;
    @Column(name = "tel_2")
    private String tel_2;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTel_1() {
        return tel_1;
    }

    public void setTel_1(String tel_1) {
        this.tel_1 = tel_1;
    }

    public String getTel_2() {
        return tel_2;
    }

    public void setTel_2(String tel_2) {
        this.tel_2 = tel_2;
    }

}
