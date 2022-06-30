package Exercicio04;

public class Cosulta extends Carro {

    private String tipoCombustivel;

    public Cosulta(String modelo, String marca,String tipoCombustivel){
        super(modelo,marca);
        this.setTipoCombustivel(tipoCombustivel);
    }

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}


}
