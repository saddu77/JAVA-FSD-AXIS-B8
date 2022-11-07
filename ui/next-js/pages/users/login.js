import Link from "next/link"


export default function Login(){
    return (
        <>
        <h2> Sign Up</h2>
        <h2>
            <Link href="/users/signup">
                <a> Sign Up </a>
            </Link>
        </h2>
        </>
    )

}