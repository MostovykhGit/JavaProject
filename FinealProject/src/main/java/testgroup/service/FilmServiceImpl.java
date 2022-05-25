package testgroup.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testgroup.model.Film;
import java.util.List;

import testgroup.dao.FilmDao;
import testgroup.dao.FilmDaoImpl;
import testgroup.model.Film;

@Service
public class FilmServiceImpl implements FilmService{

    @Autowired
    private FilmDao filmDao;

    @Override
    public List<Film> allFilms() {
        return filmDao.allFilms();
    }

    @Override
    public void add(Film film) {
        filmDao.add(film);
    }

    @Override
    public void delete(Film film) {
        filmDao.delete(film);
    }

    @Override
    public void edit(Film film) {
        filmDao.edit(film);
    }

    @Override
    public Film getById(int id) {
        return filmDao.getById(id);
    }
}
