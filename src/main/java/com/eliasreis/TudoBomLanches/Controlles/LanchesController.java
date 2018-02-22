package com.eliasreis.TudoBomLanches.Controlles;

import java.util.ArrayList;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.eliasreis.TudoBomLanches.Dto.ProdutosDTO;
import com.eliasreis.TudoBomLanches.Lanches.XBacon;
import com.eliasreis.TudoBomLanches.Lanches.XBurguer;
import com.eliasreis.TudoBomLanches.Lanches.XEgg;
import com.eliasreis.TudoBomLanches.Lanches.XEggBacon;
import com.eliasreis.TudoBomLanches.Responses.ResponseProdutos;
import com.eliasreis.TudoBomLanches.ingredientes.Alface;
import com.eliasreis.TudoBomLanches.ingredientes.Bacon;
import com.eliasreis.TudoBomLanches.ingredientes.Hamburguer;
import com.eliasreis.TudoBomLanches.ingredientes.Ovo;
import com.eliasreis.TudoBomLanches.ingredientes.Queijo;


@RestController
@RequestMapping("tudoBomLanches/api/ListaLanches")
public class LanchesController {
	@GetMapping
	public ResponseEntity<ResponseProdutos> ListaProdutos() {
		ResponseProdutos<ProdutosDTO> response = new ResponseProdutos<ProdutosDTO>();
		ArrayList<ProdutosDTO> lanches = new ArrayList<ProdutosDTO>();
		ProdutosDTO lanche1 = new ProdutosDTO();
		ProdutosDTO lanche2 = new ProdutosDTO();
		ProdutosDTO lanche3 = new ProdutosDTO();
		ProdutosDTO lanche4 = new ProdutosDTO();
		
		XBacon xbacon = new XBacon();
		XBurguer xBurguer = new XBurguer();
		XEgg xEgg = new XEgg();
		XEggBacon xEggBacon = new XEggBacon();
		
		lanche1.setNome(xbacon.getNome());
		lanche1.setValor(xbacon.getValorDoLanche());
		lanche2.setNome(xBurguer.getNome());
		lanche2.setValor(xBurguer.getValorDoLanche());
		lanche3.setNome(xEgg.getNome());
		lanche3.setValor(xEgg.getValorDoLanche());
		lanche4.setNome(xEggBacon.getNome());
		lanche4.setValor(xEggBacon.getValorDoLanche());
		lanches.add(lanche1);
		lanches.add(lanche2);
		lanches.add(lanche3);
		lanches.add(lanche4);
		response.setJava(lanches);
		
		return ResponseEntity.ok(response);
	}
	
	
}
