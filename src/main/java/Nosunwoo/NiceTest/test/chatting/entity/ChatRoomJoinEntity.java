package Nosunwoo.NiceTest.test.chatting.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "chat_room_join")
public class ChatRoomJoinEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int join_id;

    @ManyToOne // 다대일 관계를 나타냄
    @JoinColumn(name = "user_id", nullable = false) // 외래 키 매핑
    private UsersEntity user_id;

    @ManyToOne // 다대일 관계를 나타냄
    @JoinColumn(name = "room_id", nullable = false) // 외래 키 매핑
    private ChatRoomEntity room_id;


}