import React from 'react'
import Footcomponent from '../Components/footer'
import { Link } from 'react-router-dom'
import pratik from '../assets/pratik.jpg'
import imran from '../assets/imran.jpg'
import prabhat from '../assets/prabhat.jpg'
import nikita from '../assets/nikita.jpg'
import Navbar from './navHome'
const Aboutus = () => {
  return (
    <div>
      <div>
        <Navbar></Navbar>
      </div>
      <div style={{ backgroundColor: 'gainsboro' }}>
        <h1 style={{ textAlign: 'center' }}> About us</h1>
        <div
          className='container'
          style={{ paddingTop: 50, paddingBottom: 50 }}>
            <h2>About Us</h2>
          <p>Welcome to our Tiffin Delivery Management System!</p>
          Delicious everyday food using choicest raw materials, delivered to your doorstep
          Home-style meals, prepared in state-of the art automated kitchen. The kitchen maintains the highest levels of hygiene and sanitization while handling food.
          Serving North-Indian, South-Indian and desi-Chinese cuisines, choose from Vegetarian and Non-Vegetarian meal options.
          Our cooks have more than a decade of experience in catering industry.
          <p>Join us in this journey to make every meal a delightful experience!</p>
          Sign up now and save big          <br />
          <br />
          <br />
          <br />
          <h1 style={{ textAlign: 'center' }}>Team</h1>
          <div class='row text-center'>
            <div class='col-xl-3 col-sm-6 mb-5'>
              <div class='bg-white rounded shadow-sm py-5 px-4'>
                <img
                  src={imran}
                  alt=''
                  width='100'
                  class='img-fluid rounded-circle mb-3 img-thumbnail shadow-sm'
                />
                <h5 class='mb-0'>Imran Bagwan</h5>
                <span class='small text-uppercase text-muted'>
                CEO - Founder
                </span>
              </div>
            </div>

            <div class='col-xl-3 col-sm-6 mb-5'>
              <div class='bg-white rounded shadow-sm py-5 px-4'>
                <img
                  src={nikita}
                  alt=''
                  width='100'
                  class='img-fluid rounded-circle mb-3 img-thumbnail shadow-sm'
                />
                <h5 class='mb-0'>Nikita Kadam</h5>
                <span class='small text-uppercase text-muted'>
                 
                </span>
              </div>
            </div>

            <div class='col-xl-3 col-sm-6 mb-5'>
              <div class='bg-white rounded shadow-sm py-5 px-4'>
                <img
                  src={prabhat}
                  alt=''
                  width='100'
                  class='img-fluid rounded-circle mb-3 img-thumbnail shadow-sm'
                />
                <h5 class='mb-0'>Prabhat Asai</h5>
                <span class='small text-uppercase text-muted'>
                </span>
              </div>
            </div>

            <div class='col-xl-3 col-sm-6 mb-5'>
              <div class='bg-white rounded shadow-sm py-5 px-4'>
                <img
                  src={pratik}
                  alt=''
                  width='100'
                  class='img-fluid rounded-circle mb-3 img-thumbnail shadow-sm'
                />
                <h5 class='mb-0'>Pratik Koli</h5>
                <span class='small text-uppercase text-muted'>
                </span>
              </div>
            </div>
          </div>
        </div>
        <Footcomponent />
      </div>
    </div>
  )
}
export default Aboutus
