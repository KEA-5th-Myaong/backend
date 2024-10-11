package myaong.popolog.inquiryservice.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "`inquiry_reply`")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class InquiryReply extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "inquiry_reply_id")
	private Long id;

	// 부모 문의
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "inquiry_id", nullable = false, unique = true, updatable = false)
	private Inquiry inquiry;

	// 문의 답변자
	@Column(name = "member_id", nullable = false, updatable = false)
	private Long memberId;

	@Lob
	@Column(name = "content", nullable = false, updatable = false)
	private String content;
}
