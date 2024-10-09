package myaong.popolog.inquiryservice.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "`inquiry_reply`")
@Getter
@Setter
public class InquiryReply extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "inquiry_reply_id")
	private Long id;

	// 부모 문의
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "inquiry_id", nullable = false, unique = true)
	private Inquiry inquiry;

	// 문의 답변자
	@Column(name = "member_id", nullable = false)
	private Long memberId;

	@Lob
	@Column(name = "content", nullable = false)
	private String content;
}
