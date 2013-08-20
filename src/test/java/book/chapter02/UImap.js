var myMap = new UIMap();
myMap.addPageset( {
  name : 'PrestaShop',
  description : 'PrestaShop',
  pathRegexp : '.*'
});
myMap.addElement('PrestaShop', {
  name : 'searchfield',
  description : 'top searchfield',
  locator : "css=#search_query_top"
});
myMap.addElement('PrestaShop', {
  name : 'searchSubmit',
  description : 'submit button',
  locator : "css=input[name='submit_search']"
});
myMap.addElement('PrestaShop', {
  name : 'removeFromCart',
  description : 'Remove from cart',
  locator : "css=a.ajax_cart_block_remove_link"
});
myMap.addElement('PrestaShop', {
  name : 'noProductsBlock',
  description : 'Empty Cart',
  locator : "css=#cart_block_no_products"
});
