package myaong.popolog.notificationservice.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "`notification`")
@Getter
@Setter
public class Notification extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "noti_id")
	private Long id;

	// 대상 회원
	@Column(name = "member_id", nullable = false)
	private Long memberId;

	// 알림 요약
	@Column(name = "title", nullable = false)
	private String title;

	// 상세 내용
	@Column(name = "content", nullable = false)
	private String content;

	// 알림 클릭 시 연결 주소
	@Column(name = "url", nullable = false)
	private String url;

	// 읽음 여부
	@Column(name = "is_read", nullable = false)
	private Boolean isRead;
}
