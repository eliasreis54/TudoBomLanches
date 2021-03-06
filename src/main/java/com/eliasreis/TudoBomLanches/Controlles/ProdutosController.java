package com.eliasreis.TudoBomLanches.Controlles;

import java.util.ArrayList;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.eliasreis.TudoBomLanches.Dto.ProdutosDTO;
import com.eliasreis.TudoBomLanches.Responses.ResponseProdutos;
import com.eliasreis.TudoBomLanches.ingredientes.Alface;
import com.eliasreis.TudoBomLanches.ingredientes.Bacon;
import com.eliasreis.TudoBomLanches.ingredientes.Hamburguer;
import com.eliasreis.TudoBomLanches.ingredientes.Ovo;
import com.eliasreis.TudoBomLanches.ingredientes.Queijo;


@RestController
@RequestMapping("tudoBomLanches/api/ListaProdutos")
public class ProdutosController {

	// Retorna uma unidade dos produtos para consumo
	@CrossOrigin(origins = "*")
	@GetMapping
	public ResponseEntity<ResponseProdutos> ListaProdutos() {
		ResponseProdutos<ProdutosDTO> response = new ResponseProdutos<ProdutosDTO>();
		ArrayList<ProdutosDTO> produtos = new ArrayList<ProdutosDTO>();
		ProdutosDTO prod1 = new ProdutosDTO();
		ProdutosDTO prod2 = new ProdutosDTO();
		ProdutosDTO prod3 = new ProdutosDTO();
		ProdutosDTO prod4 = new ProdutosDTO();
		ProdutosDTO prod5 = new ProdutosDTO();
		
		Alface alface = new Alface(1);
		Bacon bacon = new Bacon(1);
		Hamburguer hb = new Hamburguer(1);
		Ovo ovo = new Ovo(1);
		Queijo queijo = new Queijo(1);
		
		prod1.setNome(alface.getNome());
		prod1.setValor(alface.getValorTotal());
		prod2.setNome(bacon.getNome());
		prod2.setValor(bacon.getValorTotal());
		prod3.setNome(hb.getNome());
		prod3.setValor(hb.getValorTotal());
		prod4.setNome(ovo.getNome());
		prod4.setValor(ovo.getValorTotal());
		prod5.setNome(queijo.getNome());
		prod5.setValor(queijo.getValorTotal());
		produtos.add(prod1);
		produtos.add(prod2);
		produtos.add(prod3);
		produtos.add(prod4);
		produtos.add(prod5);
		response.setJava(produtos);
		
		return ResponseEntity.ok(response);
	}
	
	
}
