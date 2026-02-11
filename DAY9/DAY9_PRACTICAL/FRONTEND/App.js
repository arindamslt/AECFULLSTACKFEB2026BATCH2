//import logo from './logo.svg';
import './App.css';
import Nav from './component/Nav';
import AddFood from './component/AddFood';
import DeleteFood from './component/DeleteFood';
import UpdateFood from './component/UpdateFood';
import FoodList from './component/FoodList';
import SearchFood from './component/SearchFood';
import Contact from './component/Contact';
import "bootstrap/dist/css/bootstrap.css";
import { Routes,Route } from 'react-router-dom';
import FoodListClient from './component/FoodListClient';
import NavClient from './component/NavClient';
import AddOrder from './component/AddOrder';
import Billing from './component/Billing';
import SearchFoodClient from './component/SearchFoodClient';
import Home from './component/Home';
import Register from './component/Register';
import Login from './component/Login';
//import Nav from './component/Nav';
//import NavClient from './component/NavClient';
function App() {
  return (
    <div className="App">
   
      
      <Routes>
           <Route path="/" element={<Home/> }/>
         <Route path="/navadmin" element={<Nav/> }/>
          <Route path="/navclient" element={<NavClient/> }/>
           <Route path="/register" element={<Register/> }/>
            <Route path="/login" element={<Login/> }/>
        <Route path="/addfood" element={<AddFood/> }/>
         <Route path="/foodlist" element={<FoodList/> }/>
          <Route path="/delfood" element={<DeleteFood/> }/>
           <Route path="/updfood" element={<UpdateFood/> }/>
            <Route path="/sfood" element={<SearchFood/> }/>
             <Route path="/contact" element={<Contact/> }/>
               <Route path="/foodlistclient" element={<FoodListClient/> }/>
               <Route path="/sfoodclient" element={<SearchFoodClient/> }/>
               <Route path="/addorder" element={<AddOrder/> }/>
                <Route path="/billing" element={<Billing/> }/>   
      </Routes>

    </div>
  );
}

export default App;
