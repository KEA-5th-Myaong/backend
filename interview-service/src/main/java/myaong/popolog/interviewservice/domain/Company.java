package myaong.popolog.interviewservice.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "`company`")
@Getter
@Setter
public class Company extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "company_id")
	private Long id;

	@Column(name = "company_name", nullable = false)
	private String name;
}
