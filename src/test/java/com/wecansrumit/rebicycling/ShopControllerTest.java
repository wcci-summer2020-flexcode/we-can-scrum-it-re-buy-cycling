package com.wecansrumit.rebicycling;

import com.wecansrumit.rebicycling.controllers.ShopRestController;
import com.wecansrumit.rebicycling.model.Shop;
import com.wecansrumit.rebicycling.repositories.BikeRepository;
import com.wecansrumit.rebicycling.repositories.ShopRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;


import java.util.Collection;
import java.util.Collections;
import java.util.Optional;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


import org.assertj.core.api.Assertions;



public class ShopControllerTest {
    @Mock
    private ShopRepository shopRepo;

    @Mock
    private BikeRepository bikeRepo;

    @InjectMocks
    private ShopRestController underTest;

    private Shop testShop;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.initMocks(this);
        testShop = new Shop ("TestShop");
    }

    @Test
    public void shouldReturnAllShops(){
        when(shopRepo.findAll()).thenReturn(Collections.singletonList(testShop));
        Collection<Shop> result = underTest.getAllShops();
        Assertions.assertThat(result).containsOnly(testShop);
    }

    @Test
    public void fetchAllEndpointReturnsAllShops() throws Exception {
        when(shopRepo.findAll()).thenReturn(Collections.singletonList(testShop));
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(underTest).build();
        mockMvc.perform(get("/api/shops/"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$", hasSize(1)))
                .andExpect(jsonPath("$[0].location", is("TestShop")));
    }

    @Test
    public void retrieveByIdShouldReturnASpecificShopById(){
        when(shopRepo.findById(1L)).thenReturn(Optional.of(testShop));
        Shop result = underTest.getShop(1L);
        Assertions.assertThat(result).isEqualTo(testShop);
    }

    @Test
    public void fetchByIdEndpointReturnASpecificBike() throws Exception{
        when(shopRepo.findById(1L)).thenReturn(Optional.of(testShop));
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(underTest).build();
        mockMvc.perform(get("/api/shops/1"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.location", is("TestShop")));
    }
}
