import './App.css'
import { BrowserRouter, Route, Routes, Link } from 'react-router-dom'
import Signin from './Pages/Signin'
import Home from './Pages/Home/home'
import Signup from './Pages/signup'
import { ToastContainer } from 'react-toastify'
import 'react-toastify/dist/ReactToastify.css'

import AdminHome from './Pages/AdminHome/index'
// import AssignOrders from './Pages/AssignOrders'
// import DeliveryDetails from './Pages/DeliveryBoyHome.js'
// import DispatchedOrdersAdmin from './Pages/dispatchedOrdersAdmin/index'
// import DeliveredOrders from './Pages/DeliveredOrdersAdmin'
// import DeliveryBoyManagement from './Pages/DeliveryBoyManagement'
// import CustomerListAdmin from './Pages/CustomerListAdmin'
// import ActiveCustomers from './Pages/ActiveCustomers'
 import Aboutus from './Components/aboutus'
// import AddDeliveryBoy from './Pages/Add DeliveryBoy'

// //import AddTiffin from "./components/tiffindetails/addtiffin";
import ShowTiffins from './Pages/Tiffin/tiffindetails/showtiffins'
// import Order from './Pages/Tiffin/tiffindetails/order'
import Description from './components/tiffindetails/description';
// import SetPayment from './Pages/Tiffin/userPayment/payment'
// import Test from './Pages/Tiffin/tiffindetails/test'
 import Address from './Pages/Tiffin/tiffindetails/address'
// import Description from './Pages/Tiffin/tiffindetails/description'
 import UserProfile from './Pages/Tiffin/user profile/userProfile'
 import EditUser from './Pages/Tiffin/edit user/editUser'
// import EditTiffin from './Pages/Tiffin/edit tiffin/editTiffin'
// import TiffinDetailsData from './Pages/Tiffin/edit tiffin/tiffinDetailsData'
// import AddTiffin from './Pages/Tiffin/tiffindetails/addtiffin'
// import Admintiffin from './Pages/Admintiffin'
// import AdminDeliveryManagement from './Pages/AdminDeliveryAddressMangement'
// import DeliveryAddressList from './Pages/AdminDeliveryAddressMangement/DeliveryAddressList'
// import Footcomponent from './Components/footer'

function App() {
  return (
    <div>
      <BrowserRouter>
        <Routes>
          <Route path='/' element={<Home />} />
          <Route path='/home' element={<Home />} />
          <Route path='/Signin' element={<Signin />} />
          <Route path='/Signup' element={<Signup />} />

          <Route path='/Admin' element={<AdminHome />} />
         
          <Route path='/Aboutus' element={<Aboutus />} />
      
     
          <Route path='/showTiffin' element={<ShowTiffins />} />
  
  
          <Route path='/address' element={<Address />} />
          <Route path='/description' element={<Description />} />
          <Route path='/userProfile' element={<UserProfile />} />
          <Route path='/editUser' element={<EditUser />} />
          
        </Routes>
        {/* <br />
        <br /> 
        <hr />
        <Footcomponent />*/}
      </BrowserRouter>
      <ToastContainer position='top-right' theme='colored' />
    </div>
  )
}

export default App
