package myaong.popolog.prejobsservice.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "`category`")
@Getter
@Setter
public class Category extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "category_id", nullable = false)
	private Long id;

	// 카테고리 이름
	@Column(name = "category_name", nullable = false, unique = true)
	private String name;
}
