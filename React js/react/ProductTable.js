import React from "react";

const ProductTable = (props) => {

    return(
        <table>
            <thead>
                <tr>
                    <th>ProdName</th>
                    <th>Price</th>
                    <th>Image</th>
                    <th>Quantity</th>
                    <th>Total</th>
                    <th>Action</th>
                </tr>
            </thead>
            <tbody>
                {props.products.length > 0 ? (
                    props.products.map( (product) =>
                <tr key={product.id}>
                    <td>{product.prodname}</td>
                    <td>{product.price}</td>
                    <td>{product.src}</td>
                    <td>{product.quantity}</td>
                    <td>{product.total}</td>
                    <td>
                        <button
                        // onClick={() => {props.editRow(product)}}                    
                            className="button muted-button">Edit</button>
                        <button
                        // onClick={() => props.deleteProduct(product.id)}
                        className="button muted-button">Delete</button>
                    </td>
                </tr>
                )):(
                    <tr>
                        <td colSpan={3}>No Product Found.</td>
                    </tr>

                )}
            </tbody>
        </table>
    );

}

export default ProductTable;