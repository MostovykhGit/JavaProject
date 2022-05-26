package testgroup.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import testgroup.model.Film;
import java.util.List;

import testgroup.dao.FilmDao;
import testgroup.dao.FilmDaoImpl;
import testgroup.model.Film;

@Service
public class FilmServiceImpl implements FilmService{

    @Autowired
    private FilmDao filmDao;

    @Transactional
    public List<Film> allFilms() {
        return filmDao.allFilms();
    }

    @Transactional
    public void add(Film film) {
        filmDao.add(film);
    }

    @Transactional
    public void delete(Film film) {
        filmDao.delete(film);
    }

    @Transactional
    public void edit(Film film) {
        filmDao.edit(film);
    }

    @Transactional
    public Film getById(int id) {
        return filmDao.getById(id);
    }
}
