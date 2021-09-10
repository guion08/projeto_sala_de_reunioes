package projeto_dio.SalaDeReuniao.repository;

import org.springframework.stereotype.Repository;
import projeto_dio.SalaDeReuniao.model.Room;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface RoomRepository extends JpaRepository<Room,Long> {
}
