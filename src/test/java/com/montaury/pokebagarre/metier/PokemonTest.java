package com.montaury.pokebagarre.metier;

import com.montaury.pokebagarre.fixtures.ConstructeurDePokemon;
import com.montaury.pokebagarre.webapi.PokeBuildApi;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

/*
    teste :
    si le pokemon ayant la plus grande attaque gagne
    si les 2 pokemon ayant la meme attaque c bien celui avec le ++ de def qui win
    si les 2 poke on att et def == alors le premier gagne
     */
class PokemonTest

{

    @Test
    void devrai_afficher_true_si_att_pok1_mieu_que_pok2()
    {
        Pokemon poke1 = ConstructeurDePokemon.unPokemon().avecAttaque(50).avecDefense(30).construire();
        Pokemon poke2 = ConstructeurDePokemon.unPokemon().avecAttaque(50).avecDefense(30).construire();
        boolean resultat =  poke1.estVainqueurContre(poke2);
        //assert resultat == true;
        //assertEqual(resultat,true);
        //System.out.println(resultat?"1er teste passer":"1er teste pas passer");
        assertThat(resultat).isTrue();
    }

    @Test
    void devrai_afficher_true_si_deff_pok1_mieu_que_pok2()
    {
        Pokemon poke1 = ConstructeurDePokemon.unPokemon().avecAttaque(50).avecDefense(30).construire();
        Pokemon poke2 = ConstructeurDePokemon.unPokemon().avecAttaque(50).avecDefense(10).construire();
        boolean resultat =  poke1.estVainqueurContre(poke2);
        //System.out.println(resultat?"2em teste passer":"2em teste pas passer");
        assertThat(resultat).isTrue();
    }

    @Test
    void devrait_afficher_true()
    {
        Pokemon poke1 = ConstructeurDePokemon.unPokemon().avecAttaque(50).avecDefense(30).construire();
        Pokemon poke2 = ConstructeurDePokemon.unPokemon().avecAttaque(50).avecDefense(30).construire();
        boolean resultat =  poke1.estVainqueurContre(poke2);
        //System.out.println(resultat?"3em teste passer":"3em teste pas passer");
        assertThat(resultat).isTrue();
    }

    /*public static void main(String[] args)
    {

        devrai_afficher_true_si_att_pok1_mieu_que_pok2();
        devrai_afficher_true_si_deff_pok1_mieu_que_pok2();
        devrai_afficher_true_();

    }*/



}