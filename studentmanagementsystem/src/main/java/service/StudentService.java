package service;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import app.HibernateUtil;
import Entity.StudentEntity;

public class StudentService{

	public void saveStudent(StudentEntity student) {
		EntityTransaction transcation=null;
		try(EntityManager entityManager =HibernateUtil.getEntityManagerFactory().createEntityManager();){
			transcation=entityManager.getTransaction();
			entityManager.persist(student);
			transcation.commit();
		}catch(Exception e) {e.printStackTrace();}
	}
	
	public List<StudentEntity> getAllStudent(){
		try(EntityManager entityManager =HibernateUtil.getEntityManagerFactory().createEntityManager();){
			return entityManager.createQuery("from EmployeeEntity",StudentEntity.class).getResultList();
		}
	}
	
	public void updateStudent(int student_id,String new_lastname) {
		EntityTransaction transcation=null;
		try(EntityManager entityManager =HibernateUtil.getEntityManagerFactory().createEntityManager();){
			transcation=entityManager.getTransaction();
			StudentEntity e= entityManager.find(StudentEntity.class,student_id);
			if(e!=null) {
				e.setLastName(new_lastname);
				entityManager.merge(e);
			}
			transcation.commit();
		}catch(Exception ee) {ee.printStackTrace();}
	}
	
	public void deletestudent(int student_id) {
		EntityTransaction transcation=null;
		try(EntityManager entityManager =HibernateUtil.getEntityManagerFactory().createEntityManager();){
			transcation=entityManager.getTransaction();
			StudentEntity stud=entityManager.find(StudentEntity.class,student_id);
			if(stud!=null) {
				entityManager.remove(stud);
			}
			transcation.commit();
		}catch(Exception ee) {ee.printStackTrace();}
	}
	
}//EmployeeService