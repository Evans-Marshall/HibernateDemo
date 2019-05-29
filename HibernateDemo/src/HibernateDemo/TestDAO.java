package HibernateDemo;

import org.hibernate.*;
import java.util.*;



public class TestDAO {
	
	SessionFactory factory = null;
	Session session = null;
	
	private static TestDAO single_instance = null;
	
	private TestDAO()
	{
		factory = HibernateUtils.getSessionFactory();
	}

	public static TestDAO getInstance()
	{
		if (single_instance == null) {
			single_instance = new TestDAO();
		}
		return single_instance;
	}
	
	
	
	public List<FamilyToSQL> getFamily () {
				
		try {
			session = factory.openSession();
			session.getTransaction().begin();
			String sql = "from HibernateDemo.FamilyToSQL";
			List<FamilyToSQL> cs = (List<FamilyToSQL>)session.createQuery(sql).getResultList();
			session.getTransaction().commit();
			return cs;
			
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
			return null;
			
		}finally {
			session.close();
		}
	}
	
	public FamilyToSQL getFamilyToSQL(String title) {
		
		try {
			
			session = factory.openSession();
			session.getTransaction().begin();
			String sql = "from HibernateDemo.FamilyToSQL";
			FamilyToSQL c = (FamilyToSQL)session.createQuery(sql).getSingleResult();
			session.getTransaction().commit();
			return c;
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
			return null;
		} finally {
			session.close();
		}
	}
		
}		
		
		
		
