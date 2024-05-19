package br.com.rapha.entities;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import lombok.Data;

@Data
public class Cliente {

	private UUID id;
	private String nome;
	private String CPF;
	private Date dataNascimento;
	private List<Endereco> enderecos;
}
