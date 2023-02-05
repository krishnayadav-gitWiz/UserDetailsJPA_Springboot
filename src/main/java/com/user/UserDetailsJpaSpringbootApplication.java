package com.user;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.user.dao.UserRepo;
import com.user.entities.User;

@SpringBootApplication
public class UserDetailsJpaSpringbootApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(UserDetailsJpaSpringbootApplication.class, args);
		UserRepo userRepo=context.getBean(UserRepo.class);
		
		//add single user
//		User user=new User();
//		user.setName("krishna");
//		user.setCity("Mumbai");
//		user.setStatus("java BE dev");
//		
//		User u1=userRepo.save(user);
//		System.out.println(u1);
		
		
		
		//add multiple users
//		User user1=new User();
//		user1.setName("Krishna");
//		user1.setCity("Mumbai");
//		user1.setStatus("java BE dev");
//		
//		
//		User user2=new User();
//		user2.setName("Hardik");
//		user2.setCity("delhi");
//		user2.setStatus("java BE dev");
//		
//		List<User> users=List.of(user1,user2);
//		Iterable<User> result=userRepo.saveAll(users);
//		
//		result.forEach(u->{
//			System.out.println(u);
//		});
		
		
		//update user
		
//		Optional<User> optional=userRepo.findById(2);
//		User user=optional.get();
//		user.setName("nilesh");
//		user.setCity("noida");
//		user.setStatus(".net FS dev");
//		
//		User result=userRepo.save(user);
//		System.out.println(result);
		
		
		//get all users
		
//		Iterable<User> itr=userRepo.findAll();
//		itr.forEach(new Consumer<User>() {
//			@Override
//			public void accept(User t) {
//				// TODO Auto-generated method stub
//				System.out.println(t);	
//			}	
//		});
//		or
//		itr.forEach(u->{System.out.println(u);});
		
		
		
		//delete user by id
//		 userRepo.deleteById(2);
//		 System.out.println("deleted");
		
		
		//delete all users
//		Iterable<User> itr=userRepo.findAll();
//		itr.forEach(user->System.out.println(user));
//		userRepo.deleteAll(itr);
		
		//find by name and city
//		List<User> u=userRepo.findByNameAndCity("krishna", "mumbai");
//		u.forEach(e->System.out.println(e));
		
		
		userRepo.getUsers().forEach(e->System.out.println(e));
		
		}

}
