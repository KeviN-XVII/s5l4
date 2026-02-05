package kevinquarta.s5l4.services;


import kevinquarta.s5l4.entities.DivisioneMenu;
import kevinquarta.s5l4.exceptions.NotFoundException;
import kevinquarta.s5l4.repositories.DivisioneMenuRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DivisioneMenuService {

    private final DivisioneMenuRepository divisioneMenuRepository;

    @Autowired
    public DivisioneMenuService(DivisioneMenuRepository divisioneMenuRepository) {
        this.divisioneMenuRepository = divisioneMenuRepository;
    }

//    inizio metodi

    public void saveElementoMenu (DivisioneMenu newDivisioneMenu) {
        if (newDivisioneMenu.getName().length() < 4) throw new IllegalArgumentException();
        if (newDivisioneMenu.getPrezzo() < 0)
            throw new IllegalArgumentException("Il prezzo non può essere negativo");
        if(newDivisioneMenu.getName() == null || newDivisioneMenu.getName().isBlank())
            throw new IllegalArgumentException("Il nome non può essere vuoto");
        if(divisioneMenuRepository.existsByName(newDivisioneMenu.getName()))
            throw new IllegalArgumentException("Nome già esistente");
    }
    public DivisioneMenu findById (long id) {
        return divisioneMenuRepository.findById(id).orElseThrow(()->new NotFoundException(id));
    }









}
