package kevinquarta.s5l4.repositories;


import kevinquarta.s5l4.entities.DivisioneMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DivisioneMenuRepository extends JpaRepository<DivisioneMenu,Long> {

    DivisioneMenu findById (long id);

    List<DivisioneMenu> findByName(String name);

    List<DivisioneMenu> findByElementoMenu(String elementoMenu);

    List<DivisioneMenu> findByCalorie( int calorie);

    List<DivisioneMenu> findByPrezzo(double prezzo);

    List<DivisioneMenu> findByElementoMenuAndName(String elementoMenu, String name);






}
