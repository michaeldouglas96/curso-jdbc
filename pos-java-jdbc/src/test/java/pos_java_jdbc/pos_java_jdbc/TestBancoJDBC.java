package pos_java_jdbc.pos_java_jdbc;

import java.util.List;

import org.junit.Test;

import dao.UserPosDao;
import model.UserPosJava;

public class TestBancoJDBC {

	@Test
	public void initBanco() {
		UserPosDao userPosDao = new UserPosDao();
		UserPosJava userPosJava = new UserPosJava();

		userPosJava.setNome("vanessa");
		userPosJava.setEmail("vanessa@gmail.com");
		userPosDao.salvar(userPosJava);

	}

	@Test
	public void initListar() {

		UserPosDao dao = new UserPosDao();
		try {
			List<UserPosJava> list = dao.listar();

			for (UserPosJava userPosJava : list) {
				System.out.println(userPosJava);
				System.out.println("----------------------------------------------------------------------------");
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

	}
	@Test
	public void initBuscar() throws Exception {
		UserPosDao dao = new UserPosDao();

		UserPosJava userPosJava = dao.buscar(4L);
		System.out.println(userPosJava);

	}

	@Test
	public void initAtualizar() {
		try {
		UserPosDao dao = new UserPosDao();
		UserPosJava objetoBanco;
		
			objetoBanco = dao.buscar(5L);
			objetoBanco.setNome("Nome ATUALIZADO");
			
			dao.atualizar(objetoBanco);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	@Test
	public void initDeletar() {
		try {
			UserPosDao dao = new UserPosDao();
			dao.deletar(2L);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
