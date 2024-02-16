package com.example.librarymanagementsystem.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "details")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
//@Where(clause = )
@DynamicUpdate
@DynamicInsert
public class Detail {
    @Id
    private Long id;
    private String title;
    private Integer unitsInStock=0;

    @OneToMany(mappedBy = "detail")
    private Set<Book> books;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "details_authors",
            joinColumns = {
                    @JoinColumn(name = "detail_id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "author_id")
            }
    )
    private Set<Author> authors = new HashSet<>();
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "details_categories",
            joinColumns = {
                    @JoinColumn(name = "detail_id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "category_id")
            }
    )
    private Set<Category> categories = new HashSet<>();

}
