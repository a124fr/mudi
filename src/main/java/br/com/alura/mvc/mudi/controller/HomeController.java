package br.com.alura.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Xiaomi Redmi Note 8");
		pedido.setUrlImagem("https://images-na.ssl-images-amazon.com/images/I/51Fv-PIiDQL._AC_SL1000_.jpg");
		pedido.setUrlProduto("https://www.amazon.com.br/Smartphone-Xiaomi-Redmi-Note-4RAM/dp/B07Y9XWK4M/ref=asc_df_B07Y9XWK4M/?tag=googleshopp00-20&linkCode=df0&hvadid=379792730378&hvpos=&hvnetw=g&hvrand=3818959471528278365&hvpone=&hvptwo=&hvqmt=&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9074242&hvtargid=pla-824195334382&psc=1");
		pedido.setDescricao("Produto");
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos", pedidos);
		
		return "home";
	}
	
}