package com.statisticsservice.statisticsservice.entities;



import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity(name = "CasoSintoma")
@Table(name = "caso_sintoma")
public class CasoSintoma {

    @EmbeddedId
    private CasoSintomaId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("casoId")
    private CasoLV caso;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("sintomaId")
    private Sintoma sintoma;

    @Column(name = "outro")
    private String outro;

    public CasoSintoma(CasoLV caso, Sintoma sintoma) {
        this.caso = caso;
        this.sintoma = sintoma;
        this.id = new CasoSintomaId(caso.retornarId(), sintoma.retornarId());
    }
    public CasoSintoma(CasoLV caso, Sintoma sintoma, String outro) {
        this.caso = caso;
        this.sintoma = sintoma;
        this.outro = outro;
        this.id = new CasoSintomaId(caso.retornarId(), sintoma.retornarId());
    }

    public CasoSintoma() {
      
    }

    public CasoSintomaId retornarId() {
        return id;
    }

    public CasoLV retornarCaso() {
        return caso;
    }

    public Sintoma retornarSintoma() {
        return sintoma;
    }

    public String retornarOutro() {
        return outro;
    }

    public void definirCaso(CasoLV caso) {
        this.caso = caso;
    }

    public void definirSintoma(Sintoma sintoma) {
        this.sintoma = sintoma;
    }

    public void definirOutro(String outro) {
        this.outro = outro;
    }

    
}
