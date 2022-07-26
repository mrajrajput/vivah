TODO for JPA
---
Bi-directional needs to be there, and both needs to set for saving keys and data.

@OneToOne needs to be in both entity.

Owner of relationship - needs to have @JoinColumn and 
it's second partner will need to have @mappedBy(parent's variable).

If @ManyToOne annotation is owner of relationship(FamilyMember) - it will have @JoinColumn, the second partner will have @OneToMany with mappedBy=parent's variable.

---


