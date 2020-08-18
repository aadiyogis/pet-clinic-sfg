package com.learning.pet.clinic.sfg.bootstrap;

import com.learning.pet.clinic.sfg.model.Owner;
import com.learning.pet.clinic.sfg.model.Vet;
import com.learning.pet.clinic.sfg.services.OwnerService;
import com.learning.pet.clinic.sfg.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * aditya created on 18/08/20
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Aditya");
        owner1.setLastName("Ajmera");

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Prabhakar");
        owner2.setLastName("Ajmera");

        ownerService.save(owner1);
        ownerService.save(owner2);

        System.out.println("Storing data complete for owner");

        Vet vet1 = new Vet();
        vet1.setId(3L);
        vet1.setFirstName("Albert");
        vet1.setLastName("Einstein");

        Vet vet2 = new Vet();
        vet2.setId(4L);
        vet2.setFirstName("Issac");
        vet2.setLastName("Newton");

        vetService.save(vet1);
        vetService.save(vet2);

        System.out.println("Storing data complete for vet");

        System.out.println("Storing data complete for whole module");
    }
}
