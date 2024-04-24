package model;
public class ConversorModel {
    String nomeMoeda;
    String tipoMoeda;
    String localMoeda;

    public ConversorModel(String nomeMoeda, String tipoMoeda, String localMoeda) {
        this.nomeMoeda = nomeMoeda;
        this.tipoMoeda = tipoMoeda;
        this.localMoeda = localMoeda;
    }

    public String getNomeMoeda() {
        return nomeMoeda;
    }

    public void setNomeMoeda(String nomeMoeda) {
        this.nomeMoeda = nomeMoeda;
    }

    public String getTipoMoeda() {
        return tipoMoeda;
    }

    public void setTipoMoeda(String tipoMoeda) {
        this.tipoMoeda = tipoMoeda;
    }

    public String getLocalMoeda() {
        return localMoeda;
    }

    public void setLocalMoeda(String localMoeda) {
        this.localMoeda = localMoeda;
    }
}
