import logo from './logo.svg';
import './App.css';
import { useState } from 'react';
import ProductTable from './tables/ProductTable';

const App = () =>{
  const productData = [
    {id:1101,prodname:'A123',price:"14,999", src: <img src="https://freebiescloud.com/wp-content/uploads/2020/10/2-85.png" height={100} width={100} alt="prod1104"/>},
    {id:1102,prodname:'A456',price:"15,999", src: <img src="https://freepngimg.com/thumb/samsung_mobile_phone/6-2-samsung-mobile-phone-picture.png" height={100} width={100} alt="prod1102"/>},
    {id:1103,prodname:'A789',price:"16,999", src: <img src="https://images.news18.com/ibnlive/uploads/2019/12/Samsung-Galaxy-S10-Lite.png?impolicy=website&width=510&height=356" height={100} width={100} alt="prod1103"/>},
    {id:1104,prodname:'B147',price:"18,999", src: <img src="https://www.pngfind.com/pngs/m/101-1016544_mobile-phone-png-samsung-galaxy-note-8-blue.png" height={100} width={100} alt="prod1104"/>}
    ];

  const[products,setProducts] = useState(productData);

  const addProduct = (product) => {
    product.id = products.length+101
    setProducts([...products,product]);
  }

  return(
    <div className="container">
      <h1>CRUD Application- ShoppingCart-App</h1>
      <div className='flex-row'>
        <div className='flex-large'>
          {/* { editing ? ( */}
            <div>
              <h2>Edit Product</h2>
              {/* <EditUserForm setEditing={setEditing} currentUser={currentUser} updatedUser={updatedUser}/>  */}
            </div>
          {/* ):( */}
            <div>
              <h2>Add Product</h2>
              {/* <AddUserForm adduser={addUser}/>  */}
            </div> 
          {/* )}       */}
        </div>
        <div className='flex-large'>
          <h2>View Products Data: </h2>
          <ProductTable products={products}/>
        </div>
      </div>
    </div>
  );

}

export default App;