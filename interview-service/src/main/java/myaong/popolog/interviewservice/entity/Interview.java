package myaong.popolog.interviewservice.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "`interview`")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Interview extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "interview_id")
	private Long id;

	// 생성한 회원
	@Column(name = "member_id", nullable = false, updatable = false)
	private Long memberId;

	// 대상 기업
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "company_id", nullable = false, updatable = false)
	private Company company;

	@Builder
	public Interview(Long memberId, Company company) {
		this.memberId = memberId;
		this.company = company;
	}
}
