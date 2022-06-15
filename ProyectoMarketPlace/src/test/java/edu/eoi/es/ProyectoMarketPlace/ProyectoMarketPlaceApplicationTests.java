//package edu.eoi.es.ProyectoMarketPlace;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import edu.es.eoi.marketplace.entity.Articulo;
//import edu.es.eoi.marketplace.repository.ArticuloRepository;
//import edu.es.eoi.marketplace.repository.PedidoRepository;
//import edu.es.eoi.marketplace.repository.UsuarioRepository;
//
//@SpringBootTest
//class ProyectoMarketPlaceApplicationTests {
//
//
//	@Autowired
//	ArticuloRepository articuloRepository;
//
//	@Autowired
//	PedidoRepository pedidoRepository;
//
//	@Autowired
//	UsuarioRepository usuarioRepositori;
//
//	@Test
//	void createarticulo() {
//
//		Articulo tmp=new Articulo();
//		tmp.setNombre("Perfume");
//		tmp.setPrecio(12.5);
//		tmp.setStock(40);
//
//
//		articuloRepository.save(tmp);
//		articuloRepository.findAll();
//
//
//
//	}
//
//}
