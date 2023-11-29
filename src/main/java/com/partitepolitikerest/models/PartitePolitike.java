package com.partitepolitikerest.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Partite")
public class PartitePolitike {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    private String emriZyrtar;
    private String akronimi;
    private String adresa;
    private int nrTelefonit;
    private String email;


    public PartitePolitike(Long id, String emriZyrtar, String akronimi, String adresa, int nrTelefonit, String email) {
        this.emriZyrtar = emriZyrtar;
        this.akronimi = akronimi;
        this.adresa = adresa;
        this.nrTelefonit = nrTelefonit;
        this.email = email;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PartitePolitike() {
    }

    public String getEmriZyrtar() {
        return emriZyrtar;
    }

    public void setEmriZyrtar(String emriZyrtar) {
        this.emriZyrtar = emriZyrtar;
    }

    public String getAkronimi() {
        return akronimi;
    }

    public void setAkronimi(String akronimi) {
        this.akronimi = akronimi;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public int getNrTelefonit() {
        return nrTelefonit;
    }

    public void setNrTelefonit(int nrTelefonit) {
        this.nrTelefonit = nrTelefonit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
