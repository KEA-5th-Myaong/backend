package myaong.popolog.portfolioservice.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "`portfolio`")
@Getter
@Setter
public class Portfolio extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "portfolio_id")
	private Long id;

	// 작성한 회원
	@Column(name = "member_id", nullable = false)
	private Long memberId;

	// 대표 포트폴리오 여부
	@Column(name = "is_main", nullable = false)
	private Boolean isMain;

	@Column(name = "memo", nullable = false)
	private String memo;

	@Column(name = "title", nullable = false)
	private String title;

	// 관심 직군
	@Column(name = "pre_job", nullable = false)
	private String preferredJob;

	// 전체 내용 JSON
	@Lob
	@Column(name = "content", nullable = false)
	private String content;

	// 공유 키
	@Column(name = "key", nullable = false)
	private String key;
}
