package com.traineeapp.model.dao.trainee;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.traineeapp.model.factory.HibernateSessionFactory;

public class TraineeDaoImpl implements TraineeDao {

	private SessionFactory factory;
	
	public TraineeDaoImpl() {
		super();
		this.factory = HibernateSessionFactory.getSessionFactory();
	}

	@Override
	public Trainee addTrainee(Trainee trainee) {
		Session session=factory.openSession();
		Transaction tx=session.getTransaction();
		try {
			tx.begin();
			session.persist(trainee);
			tx.commit();
		}catch(HibernateException ex) {
			tx.rollback();
			ex.printStackTrace();
		}
		session.close();
		return trainee;
	}

	@Override
	public List<Trainee> getAll() {
		Session session=factory.openSession();
		List<Trainee> trainees=session.createQuery("select t from Trainee t", Trainee.class).getResultList();
		return trainees;
	}

}
