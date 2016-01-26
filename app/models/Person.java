package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Mateusz on 25.01.2016.
 */
@Entity
public class Person extends Model {

    @Id
    public String id;

    public String name;
}
