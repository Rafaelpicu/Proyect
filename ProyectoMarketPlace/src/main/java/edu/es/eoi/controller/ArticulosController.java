package edu.es.eoi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.es.eoi.marketplace.dto.ArticuloDto;
import edu.es.eoi.marketplace.service.ArticuloService;

@RestController
@RequestMapping("/articulos")
public class ArticulosController {

	@Autowired
	private ArticuloService articuloService;

//    @GetMapping("/{id}")
//    public Articulo getArticulo(@PathVariable int id_ar) {
//        System.out.println("Hemos llegado al controlador");
//        return articuloService.getArticulo(id_ar).orElse(new Articulo());
//    }
//    @GetMapping("/{id}")
//    public Articulo findById(@PathVariable int id_ar) {
//        System.out.println("Hemos llegado al controlador");
//        return articuloService.findById(id_ar).orElse(new Articulo());
//    }

	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> find() {
	
		return new ResponseEntity<>(articuloService.findAll(),HttpStatus.OK);
				
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id_ar) {

		
		

		ArticuloDto articulo = articuloService.findById(id_ar);

		if (articulo != null) {
			return new ResponseEntity<>(articulo, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
}