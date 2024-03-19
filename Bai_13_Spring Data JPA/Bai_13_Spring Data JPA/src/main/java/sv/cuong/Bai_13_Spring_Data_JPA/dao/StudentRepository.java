package sv.cuong.Bai_13_Spring_Data_JPA.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import sv.cuong.Bai_13_Spring_Data_JPA.entity.Student;

import javax.swing.*;

@RepositoryRestResource(path="students")
public interface StudentRepository extends JpaRepository<Student , Integer> {
//có thể thêm các phương thức khác ngoài  các phương thúc spring boot đã tạo sẵn
//truy vấn bằng firstName
   // public List<Student> findByFirstName(String firstName);


    //truy vấn bằng firstName và lastName
    //public List<Student> findByFirstNameAndLastName(String firstName , String lastName );

    //truy vấn các students khác vs giá trị tìm kiếm
//    public List<Student> findByFirstNameNot(String firstName );
}
