package grp.pandemicmonitor.dataClasses.Menu;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuDao {
    public List<MainMenu> getMenus();
}
