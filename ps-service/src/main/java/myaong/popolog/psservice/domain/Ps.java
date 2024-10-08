package myaong.popolog.psservice.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "`ps`")
@Getter
@Setter
public class Ps extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ps_id")
	private Long id;

	// 작성한 회원
	@Column(name = "member_id", nullable = false)
	private Long memberId;

	@Column(name = "title", nullable = false)
	private String title;

	// 지원 직무
	@Column(name = "position", nullable = false)
	private String position;

	// 지원 사유
	@Lob
	@Column(name = "reason", nullable = false)
	private String reason;

	// 자기소개
	@Lob
	@Column(name = "content", nullable = false)
	private String content;
}
