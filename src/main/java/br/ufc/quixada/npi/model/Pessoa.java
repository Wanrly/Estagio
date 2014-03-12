
package br.ufc.quixada.npi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;


@Entity
public class Pessoa {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer id;

    @Column(name = "primeiro_nome")
    @NotEmpty
    protected String primeiroNome;

    @Column(name = "ultimo_nome")
    @NotEmpty
    protected String ultimoNome;
    
    public Pessoa(){
    	
    }

    public Pessoa(String nome, String sobrenome) {
		primeiroNome = nome;
		ultimoNome = sobrenome;
	}

	public String getprimeiroNome() {
        return this.primeiroNome;
    }

    public void setprimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getultimoNome() {
        return this.ultimoNome;
    }

    public void setultimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

	public Object getId() {
		// TODO Auto-generated method stub
		return null;
	}


}
