package myaong.popolog.blogservice.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import myaong.popolog.blogservice.enums.ContentsType;

@Entity
@Table(name = "`report`",
		uniqueConstraints = {@UniqueConstraint(columnNames = {"member_id", "contents_id", "contents_type"})})
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Report extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "report_id")
	private Long id;

	// 신고한 회원
	@Column(name = "member_id", nullable = false)
	private Long memberId;

	// 대상 콘텐츠
	@Column(name = "contents_id", nullable = false)
	private Long contentsId;

	// 콘텐츠 타입
	@Enumerated(EnumType.STRING)
	@Column(name = "contents_type", nullable = false)
	private ContentsType contentsType;
}
