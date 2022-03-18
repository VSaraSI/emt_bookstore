package proektna.demo.service;

import proektna.demo.model.Book;
import proektna.demo.model.Bundle;
import proektna.demo.model.ShoppingCart;

import java.util.List;

public interface ShoppingCartService {

    List<Book> listAllBooksInShoppingCart(Long cartId);
    List<Bundle> listAllBundlesInShoppingCart(Long cartId);
    ShoppingCart getActiveShoppingCart(String username);
    ShoppingCart addBookToShoppingCart(String username, Long productId);
    ShoppingCart addBundleToShoppingCart(String username, Long productId);
    void deleteBookFromShoppingCart (String username,Long bookId);
    void deleteBundleFromShoppingCart (String username,Long bookId);
}
