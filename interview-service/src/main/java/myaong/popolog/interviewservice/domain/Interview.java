package myaong.popolog.interviewservice.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "`interview`")
@Getter
@Setter
public class Interview extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "interview_id")
	private Long id;

	// 생성한 회원
	@Column(name = "member_id", nullable = false)
	private Long memberId;

	// 대상 기업
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "company_id", nullable = false)
	private Company company;
}
